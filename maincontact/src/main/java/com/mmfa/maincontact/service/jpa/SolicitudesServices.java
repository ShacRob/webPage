package com.mmfa.maincontact.service.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mmfa.maincontact.entity.Correo;
import com.mmfa.maincontact.entity.Solicitud;
import com.mmfa.maincontact.repository.SolicitudesRepository;
import com.mmfa.maincontact.service.ICorreosServices;
import com.mmfa.maincontact.service.ISolicitudesServices;
import com.mmfa.maincontact.service.util.EnvioEmailServices;

@Service
public class SolicitudesServices implements ISolicitudesServices {

	@Autowired private SolicitudesRepository repository;
	@Autowired private ICorreosServices serviceCorreo;
	@Autowired private EnvioEmailServices serviceEnvio;

	@Override
	public List<Solicitud> buscarTodo() {
		return repository.findAll();
	}

	@Override
	public Solicitud guardar(Solicitud obj) {
		Correo correo = serviceCorreo.buscar(obj.getAsociado().getId());
		String subject = "Contactar a "+obj.getNombre();
		String contenido = obj.getText() +"\n\n Datos de contacto: " + "\nNombre: " + obj.getNombre() + "\nE-mail: " + obj.getCorreo()+"\nTelefono: " +obj.getTelefono();
		serviceEnvio.sendEmail(correo.getCorreo(), subject, contenido);
		return repository.save(obj);
	}

	@Override
	public void eliminar(int id) {
		repository.deleteById(id);
	}

	@Override
	public Solicitud buscar(int id) {
		Optional<Solicitud> opt = repository.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

}
