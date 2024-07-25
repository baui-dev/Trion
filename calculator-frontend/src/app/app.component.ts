import { Component, OnChanges, OnInit } from "@angular/core";
import { CalculationRequest } from "./CalculationRequest";
import { CalculatorService } from "./calculator.service";
import { CommonModule } from "@angular/common";

@Component({
  selector: "calc-root",
  standalone: true,
  imports: [CommonModule],
  templateUrl: "./app.component.html",
  styleUrl: "./app.component.css",
})
export class AppComponent {
  /**
   * The result of the calculation.
   */
  result: string = "";

  constructor(private calculatorService: CalculatorService) {}

  passToAppComponent(a: number, b: number, operator: string) {
    this.values.a = a;
    this.values.b = b;
    this.values.operator = operator;
    console.log(
      "Values passed to App Component Class:",
      this.values.a,
      this.values.b,
      this.values.operator
    );
    this.passToCalcService(this.values);
  }

  values: CalculationRequest = {
    a: 0,
    b: 0,
    operator: "",
  };

  /**
   * Calculate the result by using the CalculatorService.
   */
  passToCalcService(values: CalculationRequest) {
    this.calculatorService.calculate(values);
  }

  public changeResult(result: string) {
    console.log("changeResult called with result: " + result);
    this.result = result;
    const resultElement = document.getElementById("result");
    if (resultElement) {
      resultElement.innerText = "Result: " + result;
  }
}
}
