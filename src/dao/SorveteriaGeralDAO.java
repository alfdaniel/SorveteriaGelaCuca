package dao;

import java.util.List;


public interface SorveteriaGeralDAO {
	
	public List listar(Object obj);
	
	public Object salvar(Object obj);

	public Object recuperar(Object obj, Object nome);


}
