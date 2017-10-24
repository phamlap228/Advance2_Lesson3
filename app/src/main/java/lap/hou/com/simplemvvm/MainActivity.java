package lap.hou.com.simplemvvm;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import lap.hou.com.simplemvvm.ClickEvent.ClickListener;
import lap.hou.com.simplemvvm.databinding.LoginDataBinding;

public class MainActivity extends AppCompatActivity {
    LoginDataBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         binding= DataBindingUtil.setContentView(this,R.layout.activity_main);

// Lets Set Value Of XML properties PROGRAMMATICALY


        LoginViewModel viewModel=new LoginViewModel("Enter Email","Enter Password","Forgot Password..?","Login");

        binding.setLogin(viewModel);






        //View Is Bound with ViewModel here Lets proceed with getting Data and Validations



        binding.setModelClickListener(new ClickListener() {
            @Override
            public void onClick() {

                Toast.makeText(MainActivity.this, binding.getLogin().getUserEmail(), Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, binding.getLogin().getUserPassword(), Toast.LENGTH_SHORT).show();

                // On Click It will display all the values
            }
        });



// We Are All Set
        /**
         * Thank You,
         * Doubts are Welcome in Comments
         *
         * SourceCode is in Description ,
         *
         * Lets Check Now
         */

    }
}