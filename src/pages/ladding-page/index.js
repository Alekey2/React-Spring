import "./index.scss";
import Logo from '../../assets/images/logo.png'
import { Link } from 'react-router-dom';
import React  from "react";
export default function Home(){
    return(
        <section className="pag-home">
            <div className="sec1">
                
                <img src={Logo} alt="Logo da SneakStyle"></img>
                
                                
            </div>
        </section>
    )
};