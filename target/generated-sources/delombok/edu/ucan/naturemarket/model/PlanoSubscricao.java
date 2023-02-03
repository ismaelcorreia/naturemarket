// Generated by delombok at Fri Feb 03 09:40:22 WAT 2023
package edu.ucan.naturemarket.model;

/**
 * @author Ismael Correia
 * @id 19802
 */
public class PlanoSubscricao extends GenericDescriptorModel {
    private Double preco;
    private Integer numDias;

    @java.lang.SuppressWarnings("all")
    public PlanoSubscricao() {
    }

    @java.lang.SuppressWarnings("all")
    public Double getPreco() {
        return this.preco;
    }

    @java.lang.SuppressWarnings("all")
    public Integer getNumDias() {
        return this.numDias;
    }

    @java.lang.SuppressWarnings("all")
    public void setPreco(final Double preco) {
        this.preco = preco;
    }

    @java.lang.SuppressWarnings("all")
    public void setNumDias(final Integer numDias) {
        this.numDias = numDias;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof PlanoSubscricao)) return false;
        final PlanoSubscricao other = (PlanoSubscricao) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$preco = this.getPreco();
        final java.lang.Object other$preco = other.getPreco();
        if (this$preco == null ? other$preco != null : !this$preco.equals(other$preco)) return false;
        final java.lang.Object this$numDias = this.getNumDias();
        final java.lang.Object other$numDias = other.getNumDias();
        if (this$numDias == null ? other$numDias != null : !this$numDias.equals(other$numDias)) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof PlanoSubscricao;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $preco = this.getPreco();
        result = result * PRIME + ($preco == null ? 43 : $preco.hashCode());
        final java.lang.Object $numDias = this.getNumDias();
        result = result * PRIME + ($numDias == null ? 43 : $numDias.hashCode());
        return result;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
        return "PlanoSubscricao(preco=" + this.getPreco() + ", numDias=" + this.getNumDias() + ")";
    }
}
