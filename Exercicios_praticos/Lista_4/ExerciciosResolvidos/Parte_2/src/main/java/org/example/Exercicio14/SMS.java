package org.example.Exercicio14;

class SMS implements Notificacao {
    @Override
    public void enviar() {
        System.out.println("Enviando notificação por SMS...");
    }
}
