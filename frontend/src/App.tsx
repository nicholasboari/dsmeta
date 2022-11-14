import Header from "./components/Header/index.js";
import SalesCard from "./components/SalesCard/index.js";
import "./index.css";

function App() {
  return (
    <div>
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
