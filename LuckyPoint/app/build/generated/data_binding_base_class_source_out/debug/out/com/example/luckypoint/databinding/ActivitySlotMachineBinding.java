// Generated by view binder compiler. Do not edit!
package com.example.luckypoint.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.luckypoint.R;
import com.example.luckypoint.slotmachine.ImageViewMotion;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySlotMachineBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageViewMotion image1;

  @NonNull
  public final ImageViewMotion image2;

  @NonNull
  public final ImageViewMotion image3;

  @NonNull
  public final FrameLayout layoutBar;

  @NonNull
  public final ImageView ptDown;

  @NonNull
  public final ImageView ptUp;

  private ActivitySlotMachineBinding(@NonNull RelativeLayout rootView,
      @NonNull ImageViewMotion image1, @NonNull ImageViewMotion image2,
      @NonNull ImageViewMotion image3, @NonNull FrameLayout layoutBar, @NonNull ImageView ptDown,
      @NonNull ImageView ptUp) {
    this.rootView = rootView;
    this.image1 = image1;
    this.image2 = image2;
    this.image3 = image3;
    this.layoutBar = layoutBar;
    this.ptDown = ptDown;
    this.ptUp = ptUp;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySlotMachineBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySlotMachineBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_slot_machine, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySlotMachineBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.image1;
      ImageViewMotion image1 = rootView.findViewById(id);
      if (image1 == null) {
        break missingId;
      }

      id = R.id.image2;
      ImageViewMotion image2 = rootView.findViewById(id);
      if (image2 == null) {
        break missingId;
      }

      id = R.id.image3;
      ImageViewMotion image3 = rootView.findViewById(id);
      if (image3 == null) {
        break missingId;
      }

      id = R.id.layout_bar;
      FrameLayout layoutBar = rootView.findViewById(id);
      if (layoutBar == null) {
        break missingId;
      }

      id = R.id.ptDown;
      ImageView ptDown = rootView.findViewById(id);
      if (ptDown == null) {
        break missingId;
      }

      id = R.id.ptUp;
      ImageView ptUp = rootView.findViewById(id);
      if (ptUp == null) {
        break missingId;
      }

      return new ActivitySlotMachineBinding((RelativeLayout) rootView, image1, image2, image3,
          layoutBar, ptDown, ptUp);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
