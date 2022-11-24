import { ToastContainer } from "react-toastify";
import Header from "./components/Header/index.js";
import SalesCard from "./components/SalesCard/index.js";

import "react-toastify/dist/ReactToastify.css";
import "./index.css";

function App() {
  return (
    <div>
      <ToastContainer />
      <Header />
      <main>
        <section id="sales">
          <div className="dsmeta-container">
            <SalesCard />
          </div>
        </section>
      </main>
    </div>
  );
}

export default App;
