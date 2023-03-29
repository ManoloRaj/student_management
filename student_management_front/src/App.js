import logo from './logo.svg';
import './App.css';
import { Navbar } from './navbar/Navbar';
import { List_container } from './list_container/List_container';
import "./assets/style.css";
import { Rightbar } from './rightbar/Rightbar';

function App() {
  return (
    <div className="App general_disposition">
      <Navbar/>
      <List_container />
      <Rightbar />
    </div>
  );
}

export default App;
