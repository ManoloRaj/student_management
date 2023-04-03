import "./assets/item_container_style.css";
import Dialog from '@mui/material/Dialog';
import DialogActions from '@mui/material/DialogActions';
import DialogContent from '@mui/material/DialogContent';
import DialogContentText from '@mui/material/DialogContentText';
import DialogTitle from '@mui/material/DialogTitle';
import { useState } from "react";

export function Item_container({
    title,
    color
}) {


    const [open, setOpen] = useState(false);

    const handleClickOpen_detail = () => {
        setOpen(true);
    };

    const handleClose_detail = () => {
        setOpen(false);
    };
    return (
        <>
            <div
                onClick={handleClickOpen_detail}
                className="item_container"
                style={{ background: color }}
            >
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

            <Dialog
                open={open}
                onClose={handleClose_detail}
                aria-labelledby="alert-dialog-title"
                aria-describedby="alert-dialog-description"
            >
                <DialogTitle id="alert-dialog-title">
                {title}
                </DialogTitle>
                <DialogContent>
                    <DialogContentText id="alert-dialog-description">
                        Let Google help apps determine location. This means sending anonymous
                        location data to Google, even when no apps are running.
                    </DialogContentText>
                </DialogContent>
                <DialogActions>
                    {/* <Button onClick={handleClose_detail}>Disagree</Button>
                    <Button onClick={handleClose_detail} autoFocus>
                        Agree
                    </Button> */}
                </DialogActions>
            </Dialog>
        </>
    )
}