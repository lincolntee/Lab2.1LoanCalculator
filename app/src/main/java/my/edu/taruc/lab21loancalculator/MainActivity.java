package my.edu.taruc.lab21loancalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String MONTHLY_PAYMENT = "payment";
    public static final String LOAN_STATUS = "status";
    public static final String VEHICLE_PRICE = "vehicle price";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateLoan(View view)
    {
        //Create an Explicit intent
        Intent intent = new Intent(this, ResultActivity.class);

        //TODO: calculate monthly payment and determine
        //Loan application status; approve or reject
        double monthlyPayment = 450.0;
        String status = "Approve";
        double vehiclePrice, downPayment, interestRate, monthlyRepayment, totalInterest, totalLoan;


        //Passing data using putExtra method
        //putExtra(TAG, value) tag name must be unique, value = actual value
        intent.putExtra(MONTHLY_PAYMENT, monthlyPayment);
        intent.putExtra(LOAN_STATUS, status);
        startActivity(intent); // bring second activity

    }



}
