package com.example.project;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u0019H\u0003J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0018\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020 H\u0002J&\u0010!\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u001a\u0010(\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0010\u0010)\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/example/project/EventScreenFragment;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lcom/example/project/MovieAdapter;", "getAdapter", "()Lcom/example/project/MovieAdapter;", "setAdapter", "(Lcom/example/project/MovieAdapter;)V", "db", "Lcom/google/firebase/firestore/FirebaseFirestore;", "movies", "Ljava/util/ArrayList;", "Lcom/example/project/Movie;", "newEventService", "Lservice/NewEventService;", "getNewEventService", "()Lservice/NewEventService;", "setNewEventService", "(Lservice/NewEventService;)V", "pref", "Landroid/content/SharedPreferences;", "checkService", "", "generateMovieList", "Lkotlin/collections/ArrayList;", "initAdapter", "view", "Landroid/view/View;", "makeCurrentFragmentInMainWindow", "fragment", "name", "", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "setOnClick", "app_debug"})
public final class EventScreenFragment extends androidx.fragment.app.Fragment {
    private final java.util.ArrayList<com.example.project.Movie> movies = null;
    @org.jetbrains.annotations.Nullable()
    private com.example.project.MovieAdapter adapter;
    public service.NewEventService newEventService;
    private android.content.SharedPreferences pref;
    private com.google.firebase.firestore.FirebaseFirestore db;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.project.MovieAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.Nullable()
    com.example.project.MovieAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final service.NewEventService getNewEventService() {
        return null;
    }
    
    public final void setNewEventService(@org.jetbrains.annotations.NotNull()
    service.NewEventService p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
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
    
    private final void initAdapter(android.view.View view) {
    }
    
    private final void setOnClick(android.view.View view) {
    }
    
    private final void checkService() {
    }
    
    @android.annotation.SuppressLint(value = {"UseCompatLoadingForDrawables"})
    private final java.util.ArrayList<com.example.project.Movie> generateMovieList() {
        return null;
    }
    
    private final void makeCurrentFragmentInMainWindow(androidx.fragment.app.Fragment fragment, java.lang.String name) {
    }
    
    public EventScreenFragment() {
        super();
    }
}