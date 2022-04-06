package ExampleClasses;

import java.util.Date;

/**
 * Representa una persona junto con algunos datos básicos sobre esta
 *
 * @author Miguel Ángel Molina
 */

public class Person {
    /**
     * Representa el nombre de una persona
     */
    public String name;
    /**
     * Representa el primer apellido de una persona
     */
    public String lastName1;
    /**
     * Representa el segundo apellido de una persona
     */
    public String lastName2;
    /**
     * Representa la fecha de nacimiento de una persona
     */
    public Date dateBirth;
    /**
     * Representa la estatura de una persona
     */
    public float height;

    /**
     * Crea una instancia del la clase Person
     *
     * @param name      Nombre de una persona
     * @param lastName1 Primer apellido de una persona
     * @param lastName2 Segundo Apellido de una persona
     * @param dateBirth Fecha de nacimiento de una persona
     * @param height    Estatura de una persona
     */
    public Person(String name, String lastName1, String lastName2, Date dateBirth, float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }

    /**
     * Obtiene el nombre de una persona contenido en el atributo name
     *
     * @return Nombre de una persona
     */
    public String getName() {
        return name;
    }

    /**
     * Asigna un nombre para una persona guardandolo en el atributo name
     *
     * @param name Nombre de una persona
     */


    public void setName(String name) {
        this.name = name;
    }
}
