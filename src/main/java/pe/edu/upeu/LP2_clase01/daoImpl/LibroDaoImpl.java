package pe.edu.upeu.LP2_clase01.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.LP2_clase01.dao.LibroDao;
import pe.edu.upeu.LP2_clase01.entity.Libro;
import pe.edu.upeu.LP2_clase01.repository.LibroRepository;
@Component
public class LibroDaoImpl implements LibroDao {
	@Autowired
	private LibroRepository repository;

	@Override
	public Libro create(Libro l) {
		// TODO Auto-generated method stub
		return repository.save(l);
	}

	@Override
	public Libro update(Libro l) {
		// TODO Auto-generated method stub
		return repository.save(l);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Libro> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Libro> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
}
