package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate date;

    public Mentoria() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mentoria{");
        sb.append("titulo=").append(getTitulo());
        sb.append(", descricao=").append(getDescricao());
        sb.append(", date=").append(date);
        sb.append('}');
        return sb.toString();
    }

}
