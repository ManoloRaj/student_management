import axios from "axios";
import { Backend_url } from "./Backend_url";

const api = axios.create({
    baseURL: Backend_url + "course"
});

export const Course_services = {
    async getListCourse() {
        try {
            const result = api.get("/getListCourse");
            return result;

        } catch (error) {
            console.log(error)
        }
    }
}