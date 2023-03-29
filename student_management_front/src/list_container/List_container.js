import "./assets/List_container_style.css";
import { Item_container } from "./Item_container";
import { Pagination_container } from "./Pagination_container";
import { Title_container } from "./Title_container";

export function List_container() {
    return (
        <div className="list_container">
            <Title_container />
            <Pagination_container />

            <Item_container
                title="Mathematics - Bioinformatics"
                color="#3485FF"
            />
            <Item_container
                title="Algebra - Linear Algebra"
                color="#DC31EF"
            />
            <Item_container
                title="Algorithm - Basis"
                color="#F67373"
            />
            <Item_container
                title="Network IT - Connectivity"
                color="#3485FF"
            />
        </div>
    )
}