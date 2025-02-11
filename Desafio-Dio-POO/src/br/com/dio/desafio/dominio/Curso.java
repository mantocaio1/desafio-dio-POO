package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
    private int cargahoraria;

    public Curso() {
    }

    public int getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargahoraria;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Curso{");
        sb.append("titulo=").append(getTitulo());
        sb.append(", descricao=").append(getDescricao());
        sb.append(", cargahoraria=").append(cargahoraria);
        sb.append('}');
        return sb.toString();
    }

}
