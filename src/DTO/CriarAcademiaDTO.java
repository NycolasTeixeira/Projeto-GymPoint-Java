/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author nycolas_teixeira
 */
public class CriarAcademiaDTO {
    private final String nome;
    private final String telefone;
    private final String descricao;
    private final double latitude;
    private final double longitude;

    public CriarAcademiaDTO(String nome, String telefone, String descricao, double latitude, double longitude) {
        this.nome = nome;
        this.telefone = telefone;
        this.descricao = descricao;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
    
}
