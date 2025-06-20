// firebase.js

import { initializeApp } from 'firebase/app';
import { getDatabase } from 'firebase/database';

const firebaseConfig = {
  apiKey: "AIzaSyDq7FI-N984HO2M7Q0l25WEoiTBqZvZfHs",
  authDomain: "innovatech-86917.firebaseapp.com",
  projectId: "innovatech-86917",
  storageBucket: "innovatech-86917.firebasestorage.app",
  messagingSenderId: "222788972248",
  appId: "1:222788972248:web:d0d5b8968f24b9c00671ad",
  measurementId: "G-GTX1QPXJ2R",
  databaseURL: "https://InnovaTech.firebaseio.com"
};

const app = initializeApp(firebaseConfig);
const database = getDatabase(app);
