public class GuidedGeometryCheck {
 public static void main(String[] args) throws Exception {

 CheckSupport.close(new practicaguiadaprogra.Cuadrado(3,3).Area(),9);
 CheckSupport.close(new practicaguiadaprogra.TrianguloE(3,3).Area(),4.5);
 CheckSupport.close(new Figuras.Rectangulo(50000,50000).Area(),2500000000d);
 practicaguiadaprogra.PracticaGuiadaProgra.main(new String[0]);

 CheckSupport.done();
 }
}
