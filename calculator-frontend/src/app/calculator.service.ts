import { Injectable } from "@angular/core";
import { CalculationRequest } from "./CalculationRequest";
import { HttpClient } from "@angular/common/http";
import { HttpHeaders } from "@angular/common/http";
import { AppComponent } from "./app.component";

/**
 * A service that provides calculation functionality by
 * sending requests to the server.
 */
@Injectable({
  providedIn: "root",
})
export class CalculatorService {
  private serverAddress = "localhost:8080";

  constructor(private http: HttpClient) {
  }

  appComponent = new AppComponent(this);

calculate(calculationRequest: CalculationRequest) {
    console.log("Calculating...");
    const url = `http://${this.serverAddress}/calculate`;

    this.http.post(url, calculationRequest).subscribe(
        (response) => {
            console.log(response);
            this.appComponent.changeResult(response.toString());
        },
        (error) => {
            console.error(error);
        }
    );
}
}
