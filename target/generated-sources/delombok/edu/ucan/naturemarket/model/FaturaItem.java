// Generated by delombok at Thu Feb 02 07:13:53 WAT 2023
package edu.ucan.naturemarket.model;

/**
 * @author Ismael Correia
 * @id 19802
 */
public class FaturaItem {
    private Fatura fatura;
    private Produto produto;
    private Double quantidade;

    public double getTotal() {
        return produto.getPreco() * quantidade;
    }

    @java.lang.SuppressWarnings("all")
    public FaturaItem() {
    }

    @java.lang.SuppressWarnings("all")
    public Fatura getFatura() {
        return this.fatura;
    }

    @java.lang.SuppressWarnings("all")
    public Produto getProduto() {
        return this.produto;
    }

    @java.lang.SuppressWarnings("all")
    public Double getQuantidade() {
        return this.quantidade;
    }

    @java.lang.SuppressWarnings("all")
    public void setFatura(final Fatura fatura) {
        this.fatura = fatura;
    }

    @java.lang.SuppressWarnings("all")
    public void setProduto(final Produto produto) {
        this.produto = produto;
    }

    @java.lang.SuppressWarnings("all")
    public void setQuantidade(final Double quantidade) {
        this.quantidade = quantidade;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public boolean equals(final java.lang.Object o) {
        if (o == this) return true;
        if (!(o instanceof FaturaItem)) return false;
        final FaturaItem other = (FaturaItem) o;
        if (!other.canEqual((java.lang.Object) this)) return false;
        final java.lang.Object this$quantidade = this.getQuantidade();
        final java.lang.Object other$quantidade = other.getQuantidade();
        if (this$quantidade == null ? other$quantidade != null : !this$quantidade.equals(other$quantidade)) return false;
        final java.lang.Object this$fatura = this.getFatura();
        final java.lang.Object other$fatura = other.getFatura();
        if (this$fatura == null ? other$fatura != null : !this$fatura.equals(other$fatura)) return false;
        final java.lang.Object this$produto = this.getProduto();
        final java.lang.Object other$produto = other.getProduto();
        if (this$produto == null ? other$produto != null : !this$produto.equals(other$produto)) return false;
        return true;
    }

    @java.lang.SuppressWarnings("all")
    protected boolean canEqual(final java.lang.Object other) {
        return other instanceof FaturaItem;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final java.lang.Object $quantidade = this.getQuantidade();
        result = result * PRIME + ($quantidade == null ? 43 : $quantidade.hashCode());
        final java.lang.Object $fatura = this.getFatura();
        result = result * PRIME + ($fatura == null ? 43 : $fatura.hashCode());
        final java.lang.Object $produto = this.getProduto();
        result = result * PRIME + ($produto == null ? 43 : $produto.hashCode());
        return result;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("all")
    public java.lang.String toString() {
        return "FaturaItem(fatura=" + this.getFatura() + ", produto=" + this.getProduto() + ", quantidade=" + this.getQuantidade() + ")";
    }
}
