// Generated by view binder compiler. Do not edit!
package com.example.luckypoint.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import com.example.luckypoint.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPickNumDiceBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final AppCompatButton button;

  @NonNull
  public final EditText editText;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final TextView tvDice;

  private ActivityPickNumDiceBinding(@NonNull LinearLayout rootView,
      @NonNull AppCompatButton button, @NonNull EditText editText, @NonNull ImageView imageView,
      @NonNull TextView tvDice) {
    this.rootView = rootView;
    this.button = button;
    this.editText = editText;
    this.imageView = imageView;
    this.tvDice = tvDice;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPickNumDiceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPickNumDiceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_pick_num_dice, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPickNumDiceBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button;
      AppCompatButton button = rootView.findViewById(id);
      if (button == null) {
        break missingId;
      }

      id = R.id.editText;
      EditText editText = rootView.findViewById(id);
      if (editText == null) {
        break missingId;
      }

      id = R.id.imageView;
      ImageView imageView = rootView.findViewById(id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.tvDice;
      TextView tvDice = rootView.findViewById(id);
      if (tvDice == null) {
        break missingId;
      }

      return new ActivityPickNumDiceBinding((LinearLayout) rootView, button, editText, imageView,
          tvDice);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
