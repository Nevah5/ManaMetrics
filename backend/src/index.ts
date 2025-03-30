import express, { Express, Request, Response } from "express";
import dotenv from "dotenv";
import pingRoutes from "./routes/pingRoutes";

dotenv.config();

const app: Express = express();
const port = process.env.PORT || 3000;

app.use("/ping", pingRoutes);

app.listen(port, () => {
  console.log(`[server]: Server is running at http://localhost:${port}`);
});