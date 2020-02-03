package com.seeder.cursomc.enums;

public enum TipoCliente {

    PESSOAFISICA(1,"Pessoa Fisica"),
    PESSOAJURIDICA(2,"Pessoa Juridica");

    private int cod;
    private String decricao;

    TipoCliente(int cod, String decricao) {
        this.cod = cod;
        this.decricao = decricao;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDecricao() {
        return decricao;
    }

    public void setDecricao(String decricao) {
        this.decricao = decricao;
    }

    public static TipoCliente toEnum(Integer cod){
        if (cod == null){
            return null;
        }
        for (TipoCliente x : TipoCliente.values()){
            if (cod.equals(x.getCod())){
                return x;
            }
        }
        throw new IllegalArgumentException("Id invalido: "+ cod);
    }

}
