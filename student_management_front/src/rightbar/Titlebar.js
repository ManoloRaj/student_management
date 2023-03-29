import pdp from "./assets/pdp.png";
import "./assets/titlebar_style.css";

export function Titlebar() {
    return (
        <>
            <div className="titlebar">
                <div className="left">
                    <div className="name">
                        Manolo Rajaonah
                    </div>
                    <div className="post">
                        CEO
                    </div>

                </div>
                <div className="right">
                    <img src={pdp}/>
                </div>
            </div>
        </>
    )
}