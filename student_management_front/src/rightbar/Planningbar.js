import "./assets/planningbar_style.css";

export function Planningbar() {
    return (
        <div className="planningbar">
            <div className="title">
                PLANNING
            </div>
            <div className="menu_duration">
                <div className="item ">
                    This day
                </div>
                <div className="item active">
                    This week
                </div>
                <div className="item">
                    This month
                </div>
                <div className="item">
                    This year
                </div>
            </div>

            <div className="calendar">
                <div className="delimit_x">
                    <div className="column">
                        M
                    </div>
                    <div className="column">
                        T
                    </div>
                    <div className="column">
                        W
                    </div>
                    <div className="column">
                        F
                    </div>
                    <div className="column">
                        S
                    </div>
                    <div className="column">
                        S
                    </div>
                    <div className="column">
                        S
                    </div>
                </div>
                <div className="delimit_y">
                    <div className="column_pair">
                        
                    </div>
                    <div className="">
                        
                    </div>
                    <div className="column_pair">
                        
                    </div>
                    <div className="">
                        
                    </div>
                    <div className="column_pair">
                        
                    </div>
                    <div className="">
                        
                    </div>
                    <div className="column_pair">
                        
                    </div>
                </div>

                <div className="barette">
                    <div className="br_1">

                    </div>
                    <div className="br_2">

                    </div>
                    <div className="br_3">

                    </div>
                    <div className="br_2">

                    </div>
                </div>
            </div>
        </div>
    )
}