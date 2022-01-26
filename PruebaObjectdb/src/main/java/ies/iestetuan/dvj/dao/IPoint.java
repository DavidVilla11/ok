package ies.iestetuan.dvj.dao;

import java.util.List;

import es.iestetuan.dvj.vo.Point;

public interface IPoint {

	public void Crear (Point point);
	public void CrearPuntos ();
	public long getNumeroPuntos();
	public float getMediaPuntos();
	public List<Point> getListaPuntos();
}
