import "./assets/navbar_style.css";

export function Navbar() {
    return (
        <>
            <div className="navbar">
                <div className="title">
                    Student <br /> management
                </div>
                <div className="menu">
                    <div className="item ">
                        <div className="icon active_icon">
                            C
                        </div>
                        <div className="content active_content">
                            Course
                        </div>
                    </div>
                    <div className="item">
                        <div className="icon">
                            S
                        </div>
                        <div className="content">
                            Student
                        </div>
                    </div>
                    <div className="item">
                        <div className="icon">
                            T
                        </div>
                        <div className="content">
                            Tools
                        </div>
                    </div>
                </div>
            </div>
        </>
    )
}