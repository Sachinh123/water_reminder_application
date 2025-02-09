// Generated by data binding compiler. Do not edit!
package com.afl.waterReminderDrinkAlarmMonitor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.afl.waterReminderDrinkAlarmMonitor.R;
import com.afl.waterReminderDrinkAlarmMonitor.ui.notifications.NotificationsViewModel;
import com.suke.widget.SwitchButton;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentNotificationsBinding extends ViewDataBinding {
  @NonNull
  public final Spinner finishingTimeSpinner;

  @NonNull
  public final Spinner intervalSpinner;

  @NonNull
  public final LinearLayout notificationContainerTobeHidden;

  @NonNull
  public final LinearLayout notificationEndTimeContainer;

  @NonNull
  public final TextView notificationEndTimeText;

  @NonNull
  public final LinearLayout notificationIntervalContainer;

  @NonNull
  public final TextView notificationIntervalText;

  @NonNull
  public final LinearLayout notificationPermissionContainer;

  @NonNull
  public final SwitchButton notificationPermissionSwitch;

  @NonNull
  public final TextView notificationPermissionText;

  @NonNull
  public final LinearLayout notificationStartTimeContainer;

  @NonNull
  public final TextView notificationStartTimeText;

  @NonNull
  public final Spinner startingTimeSpinner;

  @Bindable
  protected NotificationsViewModel mNotificationsViewModel;

  protected FragmentNotificationsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Spinner finishingTimeSpinner, Spinner intervalSpinner,
      LinearLayout notificationContainerTobeHidden, LinearLayout notificationEndTimeContainer,
      TextView notificationEndTimeText, LinearLayout notificationIntervalContainer,
      TextView notificationIntervalText, LinearLayout notificationPermissionContainer,
      SwitchButton notificationPermissionSwitch, TextView notificationPermissionText,
      LinearLayout notificationStartTimeContainer, TextView notificationStartTimeText,
      Spinner startingTimeSpinner) {
    super(_bindingComponent, _root, _localFieldCount);
    this.finishingTimeSpinner = finishingTimeSpinner;
    this.intervalSpinner = intervalSpinner;
    this.notificationContainerTobeHidden = notificationContainerTobeHidden;
    this.notificationEndTimeContainer = notificationEndTimeContainer;
    this.notificationEndTimeText = notificationEndTimeText;
    this.notificationIntervalContainer = notificationIntervalContainer;
    this.notificationIntervalText = notificationIntervalText;
    this.notificationPermissionContainer = notificationPermissionContainer;
    this.notificationPermissionSwitch = notificationPermissionSwitch;
    this.notificationPermissionText = notificationPermissionText;
    this.notificationStartTimeContainer = notificationStartTimeContainer;
    this.notificationStartTimeText = notificationStartTimeText;
    this.startingTimeSpinner = startingTimeSpinner;
  }

  public abstract void setNotificationsViewModel(@Nullable NotificationsViewModel notificationsViewModel);

  @Nullable
  public NotificationsViewModel getNotificationsViewModel() {
    return mNotificationsViewModel;
  }

  @NonNull
  public static FragmentNotificationsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_notifications, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentNotificationsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentNotificationsBinding>inflateInternal(inflater, R.layout.fragment_notifications, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentNotificationsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_notifications, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentNotificationsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentNotificationsBinding>inflateInternal(inflater, R.layout.fragment_notifications, null, false, component);
  }

  public static FragmentNotificationsBinding bind(@NonNull View view) {
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
  public static FragmentNotificationsBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentNotificationsBinding)bind(component, view, R.layout.fragment_notifications);
  }
}
