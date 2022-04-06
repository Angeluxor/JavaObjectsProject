package ExampleClasses;

/**
 * Representa una cuenta bancaria con su número y estado de activación
 *
 * @author Miguel Ángel Molina
 */

public class BankAccount {
    /**
     * Número de una cuenta bancaria
     */
    private final int accountNumber;
    /**
     * Estado de activación de una cuenta bancaria
     */
    protected boolean activated = false;

    /**
     * Crea una instancia de la clase BankAccount
     *
     * @param accountNumber Número de una cuenta bancaria
     */
    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Obtiene el estado de activación de una cuenta
     *
     * @return Estado de activación de una cuenta
     */


    public boolean getActivated() {
        return activated;
    }

    /**
     * Asigna el estado de activación de una cuenta
     *
     * @param activated Estado de activación de una cuenta
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
