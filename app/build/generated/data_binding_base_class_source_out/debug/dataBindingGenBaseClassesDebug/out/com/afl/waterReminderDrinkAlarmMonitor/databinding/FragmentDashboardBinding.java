// Generated by data binding compiler. Do not edit!
package com.afl.waterReminderDrinkAlarmMonitor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import co.ceryle.radiorealbutton.RadioRealButtonGroup;
import com.afl.waterReminderDrinkAlarmMonitor.R;
import com.afl.waterReminderDrinkAlarmMonitor.ui.dashboard.DashboardViewModel;
import com.google.android.material.textfield.TextInputLayout;
import com.xw.repo.BubbleSeekBar;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentDashboardBinding extends ViewDataBinding {
  @NonNull
  public final EditText ageEditText;

  @NonNull
  public final TextInputLayout ageEditTextLayout;

  @NonNull
  public final RadioRealButtonGroup genderRadio;

  @NonNull
  public final Guideline guideline;

  @NonNull
  public final TextView infoText;

  @NonNull
  public final RadioRealButtonGroup metricRadio;

  @NonNull
  public final ContentLoadingProgressBar progressBar;

  @NonNull
  public final TextView waterAmountText;

  @NonNull
  public final BubbleSeekBar waterSeekBar;

  @NonNull
  public final EditText weightEditText;

  @NonNull
  public final TextInputLayout weightEditTextLayout;

  @Bindable
  protected DashboardViewModel mDashboardViewModel;

  protected FragmentDashboardBinding(Object _bindingComponent, View _root, int _localFieldCount,
      EditText ageEditText, TextInputLayout ageEditTextLayout, RadioRealButtonGroup genderRadio,
      Guideline guideline, TextView infoText, RadioRealButtonGroup metricRadio,
      ContentLoadingProgressBar progressBar, TextView waterAmountText, BubbleSeekBar waterSeekBar,
      EditText weightEditText, TextInputLayout weightEditTextLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ageEditText = ageEditText;
    this.ageEditTextLayout = ageEditTextLayout;
    this.genderRadio = genderRadio;
    this.guideline = guideline;
    this.infoText = infoText;
    this.metricRadio = metricRadio;
    this.progressBar = progressBar;
    this.waterAmountText = waterAmountText;
    this.waterSeekBar = waterSeekBar;
    this.weightEditText = weightEditText;
    this.weightEditTextLayout = weightEditTextLayout;
  }

  public abstract void setDashboardViewModel(@Nullable DashboardViewModel dashboardViewModel);

  @Nullable
  public DashboardViewModel getDashboardViewModel() {
    return mDashboardViewModel;
  }

  @NonNull
  public static FragmentDashboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_dashboard, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentDashboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentDashboardBinding>inflateInternal(inflater, R.layout.fragment_dashboard, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentDashboardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_dashboard, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentDashboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentDashboardBinding>inflateInternal(inflater, R.layout.fragment_dashboard, null, false, component);
  }

  public static FragmentDashboardBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentDashboardBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentDashboardBinding)bind(component, view, R.layout.fragment_dashboard);
  }
}
