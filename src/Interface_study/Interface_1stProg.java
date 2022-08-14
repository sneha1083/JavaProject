package Interface_study;

public interface Interface_1stProg {
	int i=5;//variable a is by default static(because interface is not instantiated on their own) and final
	public abstract void m1(); //methods are by default public and abstract(incomplete method)
	public abstract void m2();
	

}
/*An interface which has no member is known as a marker or tagged interface, 
 * for example, Serializable, Cloneable, Remote, etc. They are used to provide some essential 
 * information to the JVM so that JVM may perform some useful operation.
 * public interface Serializable{  
                   }  
 */
