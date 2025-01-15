import React, { useState, useEffect } from "react";
import axios from "axios";

function App() {
  const [products, setProducts] = useState([]);
  const [selectedProduct, setSelectedProduct] = useState(null);
  const [newProduct, setNewProduct] = useState({
    name: "",
    description: "",
    price: 0,
    stock: 0,
  });

  const API_URL = process.env.REACT_APP_API_URL || "http://localhost:8080";

  useEffect(() => {
    fetchProducts();
  }, []);

  const fetchProducts = async () => {
    try {
      const response = await axios.get(`${API_URL}/products`);
      setProducts(response.data);
      console.log("Fetched products:", response.data);
    } catch (error) {
      console.error("Error fetching products:", error);
    }
  };

  const fetchProductDetails = async (id) => {
    try {
      const response = await axios.get(`${API_URL}/products/${id}`);
      setSelectedProduct(response.data);
    } catch (error) {
      console.error("Error fetching product details:", error);
    }
  };

  const addProduct = async () => {
    try {
      await axios.post(`${API_URL}/products`, newProduct);
      setNewProduct({ name: "", description: "", price: 0, stock: 0 });
      fetchProducts();
    } catch (error) {
      console.error("Error adding product:", error);
    }
  };

  const updateProduct = async (id, updatedProduct) => {
    try {
      await axios.put(`${API_URL}/products/${id}`, updatedProduct);
      fetchProducts();
    } catch (error) {
      console.error("Error updating product:", error);
    }
  };

  const deleteProduct = async (id) => {
    try {
      await axios.delete(`${API_URL}/products/${id}`);
      fetchProducts();
    } catch (error) {
      console.error("Error deleting product:", error);
    }
  };

  return (
    <div className="App">
      <h1>Produktkatalog</h1>

      <h2>Produktliste</h2>
      <ul>
        {products.map((product) => (
          <li key={product.id}>
            {product.name} - {product.price}€
            <button onClick={() => fetchProductDetails(product.id)}>
              Details
            </button>
            <button onClick={() => deleteProduct(product.id)}>Löschen</button>
          </li>
        ))}
      </ul>

      {selectedProduct && (
        <div>
          <h2>Produktdetails</h2>
          <p>Name: {selectedProduct.name}</p>
          <p>Beschreibung: {selectedProduct.description}</p>
          <p>Preis: {selectedProduct.price}€</p>
          <button
            onClick={() =>
              updateProduct(selectedProduct.id, {
                ...selectedProduct,
                name: "Updated Name",
              })
            }
          >
            Aktualisieren
          </button>
        </div>
      )}

      <h2>Neues Produkt hinzufügen</h2>
      <form
        onSubmit={(e) => {
          e.preventDefault();
          addProduct();
        }}
      >
        <input
          type="text"
          placeholder="Name"
          value={newProduct.name}
          onChange={(e) =>
            setNewProduct({ ...newProduct, name: e.target.value })
          }
        />
        <input
          type="text"
          placeholder="Beschreibung"
          value={newProduct.description}
          onChange={(e) =>
            setNewProduct({ ...newProduct, description: e.target.value })
          }
        />
        <input
          type="number"
          placeholder="Preis"
          value={newProduct.price}
          onChange={(e) =>
            setNewProduct({ ...newProduct, price: parseFloat(e.target.value) })
          }
        />
        <button type="submit">Hinzufügen</button>
      </form>
    </div>
  );
}

export default App;
