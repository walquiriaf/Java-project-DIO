package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CategoriaLivros {
    
    private List<Livro> livroList;

    public CategoriaLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(livroList.isEmpty()) {
            for(Livro l : livroList) {
                if(l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(livroList.isEmpty()) {
            for(Livro l : livroList) {
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CategoriaLivros categoriaLivros = new CategoriaLivros();
        categoriaLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        categoriaLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        categoriaLivros.adicionarLivro("Livro 3", "Autor 2", 2022);
        categoriaLivros.adicionarLivro("Livro 4", "Autor 4", 2023);
        categoriaLivros.adicionarLivro("Livro 5", "Autor 5", 2024);

        System.out.println(categoriaLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(categoriaLivros.pesquisarPorIntervaloAnos(2020, 2023));
        System.out.println(categoriaLivros.pesquisarPorTitulo("Livro 1"));

    }
}