public class ConditionalCheck {
 public static void main(String[] args) throws Exception {

 menu_ciclos.Condicionales c=new menu_ciclos.Condicionales("B",3);
 CheckSupport.equal(c.cIfElse(new String("B")),"B");CheckSupport.equal(c.cIfElseIf(0),0);CheckSupport.equal(c.cIfElseElse(2),2);
 CheckSupport.check(c.toString().contains("numero=2"),"toString is side effect free");

 CheckSupport.done();
 }
}
