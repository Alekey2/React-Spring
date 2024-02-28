import "./index.scss";
import React from "react";
import Logo from '../../assets/images/logo.png'
export default function RecSenha() {
    return (
        <section className="pag-rec">
            <img src={Logo} alt="Logo SneakStyle" />

            <div className="sec1">
                <h1>Recuperar sua Senha</h1>
                <div className="div-input">
                    <p>Caso tenha esquecido sua senha digite seu E-mail no campo logo abaixo que enviaremos um link para que você possa redefinir sua senha !! </p>
                    <input type="text" name="Email" placeholder="E-mail"></input>

                </div>

                <div className="botao">
                    <button> Enviar </button>
                </div>

                <div className="cad">
                    <p>Não tem uma conta ainda ? <a href="Cadastro"> Cadastre-se</a></p>
                </div>


            </div>
        </section>
    )
};