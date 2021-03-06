// Generated by view binder compiler. Do not edit!
package com.vesam.barexamlibrary.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import com.vesam.barexamlibrary.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemTestBinding implements ViewBinding {
  @NonNull
  private final LinearLayoutCompat rootView;

  @NonNull
  public final ShapeableImageView image;

  @NonNull
  public final LinearLayout lnParent;

  @NonNull
  public final TextView txtDescription;

  @NonNull
  public final MaterialTextView txtMoney;

  @NonNull
  public final MaterialTextView txtQuestionCount;

  @NonNull
  public final TextView txtTitle;

  private ItemTestBinding(@NonNull LinearLayoutCompat rootView, @NonNull ShapeableImageView image,
      @NonNull LinearLayout lnParent, @NonNull TextView txtDescription,
      @NonNull MaterialTextView txtMoney, @NonNull MaterialTextView txtQuestionCount,
      @NonNull TextView txtTitle) {
    this.rootView = rootView;
    this.image = image;
    this.lnParent = lnParent;
    this.txtDescription = txtDescription;
    this.txtMoney = txtMoney;
    this.txtQuestionCount = txtQuestionCount;
    this.txtTitle = txtTitle;
  }

  @Override
  @NonNull
  public LinearLayoutCompat getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemTestBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemTestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_test, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemTestBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.image;
      ShapeableImageView image = rootView.findViewById(id);
      if (image == null) {
        break missingId;
      }

      id = R.id.lnParent;
      LinearLayout lnParent = rootView.findViewById(id);
      if (lnParent == null) {
        break missingId;
      }

      id = R.id.txtDescription;
      TextView txtDescription = rootView.findViewById(id);
      if (txtDescription == null) {
        break missingId;
      }

      id = R.id.txtMoney;
      MaterialTextView txtMoney = rootView.findViewById(id);
      if (txtMoney == null) {
        break missingId;
      }

      id = R.id.txtQuestionCount;
      MaterialTextView txtQuestionCount = rootView.findViewById(id);
      if (txtQuestionCount == null) {
        break missingId;
      }

      id = R.id.txtTitle;
      TextView txtTitle = rootView.findViewById(id);
      if (txtTitle == null) {
        break missingId;
      }

      return new ItemTestBinding((LinearLayoutCompat) rootView, image, lnParent, txtDescription,
          txtMoney, txtQuestionCount, txtTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
