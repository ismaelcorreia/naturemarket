// Generated by delombok at Fri Feb 03 11:27:50 WAT 2023
package edu.ucan.naturemarket.model;

/**
 * @author Ismael Correia
 * @id 19802
 */
public class Fornecedor extends GenericModel {
    private ContaCorrente titular;
    private String nif;

    @java.lang.SuppressWarnings("all")
    public Fornecedor() {
    }

    @java.lang.SuppressWarnings("all")
    public ContaCorrente getTitular() {
        return this.titular;
    }

    @java.lang.SuppressWarnings("all")
    public String getNif() {
        return this.nif;
    }

    @java.lang.SuppressWarnings("all")
    public void setTitular(final ContaCorrente titular) {
        this.titular = titular;
    }

    @java.lang.SuppressWarnings("all")
    public void setNif(final String nif) {
        this.nif = nif;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof Fornecedor)) return false;
        final Fornecedor other = (Fornecedor) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$titular = this.getTitular();
        final java.lang.Object other$titular = other.getTitular();
        if (this$titular == null ? other$titular != null : !this$titular.equals(other$titular)) return false;
        final java.lang.Object this$nif = this.getNif();
        final java.lang.Object other$nif = other.getNif();
        if (this$nif == null ? other$nif != null : !this$nif.equals(other$nif)) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof Fornecedor;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $titular = this.getTitular();
        result = result * PRIME + ($titular == null ? 43 : $titular.hashCode());
        final java.lang.Object $nif = this.getNif();
        result = result * PRIME + ($nif == null ? 43 : $nif.hashCode());
        return result;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
        return "Fornecedor(titular=" + this.getTitular() + ", nif=" + this.getNif() + ")";
    }
}
