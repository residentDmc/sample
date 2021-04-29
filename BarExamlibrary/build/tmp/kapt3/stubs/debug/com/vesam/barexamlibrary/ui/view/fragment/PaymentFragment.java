package com.vesam.barexamlibrary.ui.view.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J\b\u0010 \u001a\u00020\u0019H\u0002J\b\u0010!\u001a\u00020\u0019H\u0002J%\u0010\"\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$H\u0002\u00a2\u0006\u0002\u0010&J\b\u0010\'\u001a\u00020\u0019H\u0002J\b\u0010(\u001a\u00020\u0019H\u0002J\b\u0010)\u001a\u00020\u0019H\u0002J$\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u001a\u00102\u001a\u00020\u00192\u0006\u00103\u001a\u00020+2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u0010\u00104\u001a\u00020\u00192\u0006\u00105\u001a\u00020\u001eH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lcom/vesam/barexamlibrary/ui/view/fragment/PaymentFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapterImageSlider", "Lcom/vesam/barexamlibrary/ui/view/adapter/slider_list/AdapterImageSlider;", "getAdapterImageSlider", "()Lcom/vesam/barexamlibrary/ui/view/adapter/slider_list/AdapterImageSlider;", "adapterImageSlider$delegate", "Lkotlin/Lazy;", "binding", "Lcom/vesam/barexamlibrary/databinding/FragmentPaymentBinding;", "handler", "Landroid/os/Handler;", "navController", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "navController$delegate", "runnable", "Ljava/lang/Runnable;", "getList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "initAction", "", "initAddBottomDots", "lnDots", "Landroid/widget/LinearLayout;", "size", "", "current", "initAppCompatActivityToolbar", "initFinish", "initLoopDots", "dots", "", "Landroid/widget/ImageView;", "(Landroid/widget/LinearLayout;[Landroid/widget/ImageView;)V", "initOnClick", "initToolbar", "initViewPagerSlider", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "startAutoSlider", "count", "BarExamlibrary_debug"})
public final class PaymentFragment extends androidx.fragment.app.Fragment {
    private com.vesam.barexamlibrary.databinding.FragmentPaymentBinding binding;
    private java.lang.Runnable runnable;
    private final kotlin.Lazy navController$delegate = null;
    private final kotlin.Lazy adapterImageSlider$delegate = null;
    private final android.os.Handler handler = null;
    
    private final androidx.navigation.NavController getNavController() {
        return null;
    }
    
    private final com.vesam.barexamlibrary.ui.view.adapter.slider_list.AdapterImageSlider getAdapterImageSlider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initAction() {
    }
    
    private final void initOnClick() {
    }
    
    private final void initViewPagerSlider() {
    }
    
    private final java.util.ArrayList<java.lang.String> getList() {
        return null;
    }
    
    private final void startAutoSlider(int count) {
    }
    
    private final void initAddBottomDots(android.widget.LinearLayout lnDots, int size, int current) {
    }
    
    private final void initLoopDots(android.widget.LinearLayout lnDots, android.widget.ImageView[] dots) {
    }
    
    private final void initToolbar() {
    }
    
    private final void initAppCompatActivityToolbar() {
    }
    
    private final void initFinish() {
    }
    
    public PaymentFragment() {
        super();
    }
}