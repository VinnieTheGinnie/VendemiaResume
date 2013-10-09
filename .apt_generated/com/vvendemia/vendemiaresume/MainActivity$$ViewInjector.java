// Generated code from Butter Knife. Do not modify!
package com.vvendemia.vendemiaresume;

import android.view.View;
import butterknife.Views.Finder;

public class MainActivity$$ViewInjector {
  public static void inject(Finder finder, final com.vvendemia.vendemiaresume.MainActivity target, Object source) {
    View view;
    view = finder.findById(source, 2131230723);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131230723' for field 'myName' was not found. If this field binding is optional add '@Optional'.");
    }
    target.myName = (android.widget.TextView) view;
    view = finder.findById(source, 2131230725);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131230725' for field 'phone' was not found. If this field binding is optional add '@Optional'.");
    }
    target.phone = (android.widget.TextView) view;
    view = finder.findById(source, 2131230736);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131230736' for field 'skillsAbsLayout' was not found. If this field binding is optional add '@Optional'.");
    }
    target.skillsAbsLayout = (android.widget.LinearLayout) view;
    view = finder.findById(source, 2131230729);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131230729' for field 'graduationInfo' was not found. If this field binding is optional add '@Optional'.");
    }
    target.graduationInfo = (android.widget.TextView) view;
    view = finder.findById(source, 2131230724);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131230724' for field 'address' was not found. If this field binding is optional add '@Optional'.");
    }
    target.address = (android.widget.TextView) view;
    view = finder.findById(source, 2131230728);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131230728' for field 'school' was not found. If this field binding is optional add '@Optional'.");
    }
    target.school = (android.widget.TextView) view;
    view = finder.findById(source, 2131230734);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131230734' for field 'accomplishmentsLayout' was not found. If this field binding is optional add '@Optional'.");
    }
    target.accomplishmentsLayout = (android.widget.LinearLayout) view;
    view = finder.findById(source, 2131230726);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131230726' for field 'email' was not found. If this field binding is optional add '@Optional'.");
    }
    target.email = (android.widget.TextView) view;
    view = finder.findById(source, 2131230730);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131230730' for field 'majorLayout' was not found. If this field binding is optional add '@Optional'.");
    }
    target.majorLayout = (android.widget.LinearLayout) view;
    view = finder.findById(source, 2131230732);
    if (view == null) {
      throw new IllegalStateException("Required view with id '2131230732' for field 'experienceLayout' was not found. If this field binding is optional add '@Optional'.");
    }
    target.experienceLayout = (android.widget.LinearLayout) view;
  }

  public static void reset(com.vvendemia.vendemiaresume.MainActivity target) {
    target.myName = null;
    target.phone = null;
    target.skillsAbsLayout = null;
    target.graduationInfo = null;
    target.address = null;
    target.school = null;
    target.accomplishmentsLayout = null;
    target.email = null;
    target.majorLayout = null;
    target.experienceLayout = null;
  }
}
