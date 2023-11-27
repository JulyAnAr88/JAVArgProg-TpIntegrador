package javarg_progama.tp_integrador;

import java.util.ArrayList;
import java.util.List;

public class Reportes {
	
	/* Quién fue el técnico que más rápido resolvió los incidentes.
	 * Saca la diferencia entre el tiempo de resolución del/la técnicx y el tiempo de asignación 
	 * de la incidencia y devuelve quien haya tenido la menor 
	 * */
	public Tecnicx informarTecnicxMasRapidx() {
		return null;}
	
	/* Quién fue el técnico con más incidentes resueltos en los últimos N días.
	 * Busca en la lista de incidentesResueltos del/la tecnicx los días específicos 
	 * y retorna quien haya resuelto más
	 * @param dias
	 * */
	public Tecnicx informarTecnicxMasIncidentes(int dias) {
		return null;}
	
	/* Quién fue el técnico con más incidentes resueltos de una determinada
	 * especialidad en los últimos N días.
	 * Además de filtrar por días, tendrá en cuenta la especialidad 
	 * @param dias
	 * */
	public Tecnicx informarTecnicxMasIncidentesPorEspecialidad(int dias) {
		return null;}
	
	/* El sistema debe permitir al área de RRHH emitir diariamente reportes con los 
	 * incidentes asignados a cada técnico y el estado de los mismos.
	 * Dado unx tecnicx, se lista la cantidad de incidentes que le fueron asignados en el día.
	 * @param tecnicx
	 * */
	public List<Integer> informarIncidentesDiarios(Tecnicx tecnicx) {
		List<Integer> test = new ArrayList<Integer>();
		return test;
	} 
	
}
