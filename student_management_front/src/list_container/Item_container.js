import "./assets/item_container_style.css";

export function Item_container({
    title,
    color
}) {
    return (
        <div className="item_container" style={{background : color}}>
            <div className="ic1">
                <div className="title">
                    {title}
                </div>
                <div className="place_number">
                    <div className="item_place active"></div>
                    <div className="item_place active"></div>
                    <div className="item_place active"></div>
                    <div className="item_place"></div>
                    <div className="item_place"></div>
                    <div className="item_place"></div>
                </div>
            </div>
            <div className="ic2">
                <div className="right">
                    <div className="enroll_number">
                        12
                    </div>
                    <div className="enroll">
                        Enroll
                    </div>
                </div>

            </div>
        </div>
    )
}