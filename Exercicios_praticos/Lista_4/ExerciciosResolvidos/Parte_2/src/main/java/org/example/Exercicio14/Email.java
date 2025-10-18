package org.example.Exercicio14;

class Email implements Notificacao {
    @Override
    public void enviar() {
        System.out.println("Enviando notificação por Email...");
    }
}
