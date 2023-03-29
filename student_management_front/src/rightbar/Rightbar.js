import "./assets/rightbar_style.css";
import { Planningbar } from "./Planningbar";
import { Titlebar } from "./Titlebar";

export function Rightbar() {
    return (
        <div className="rightbar">
            <Titlebar />
            <Planningbar />
        </div>
    )
}