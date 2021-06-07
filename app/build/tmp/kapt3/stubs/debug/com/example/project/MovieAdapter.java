package com.example.project;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lcom/example/project/MovieAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/project/MovieAdapter$MovieViewHolder;", "movies", "", "Lcom/example/project/Movie;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "pref", "Landroid/content/SharedPreferences;", "(Ljava/util/List;Landroidx/fragment/app/FragmentManager;Landroid/content/SharedPreferences;)V", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "getMovies", "()Ljava/util/List;", "getPref", "()Landroid/content/SharedPreferences;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MovieViewHolder", "app_debug"})
public final class MovieAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.project.MovieAdapter.MovieViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.project.Movie> movies = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.fragment.app.FragmentManager fragmentManager = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.SharedPreferences pref = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.project.MovieAdapter.MovieViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.project.MovieAdapter.MovieViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.project.Movie> getMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.fragment.app.FragmentManager getFragmentManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.SharedPreferences getPref() {
        return null;
    }
    
    public MovieAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.project.Movie> movies, @org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences pref) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J \u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0005H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0016"}, d2 = {"Lcom/example/project/MovieAdapter$MovieViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "pref", "Landroid/content/SharedPreferences;", "(Landroid/view/View;Landroidx/fragment/app/FragmentManager;Landroid/content/SharedPreferences;)V", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "getPref", "()Landroid/content/SharedPreferences;", "bind", "", "movie", "Lcom/example/project/Movie;", "makeCurrentFragmentInMainWindow", "fragment", "Landroidx/fragment/app/Fragment;", "name", "", "app_debug"})
    public static final class MovieViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final androidx.fragment.app.FragmentManager fragmentManager = null;
        @org.jetbrains.annotations.NotNull()
        private final android.content.SharedPreferences pref = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.project.Movie movie) {
        }
        
        private final void makeCurrentFragmentInMainWindow(androidx.fragment.app.Fragment fragment, java.lang.String name, androidx.fragment.app.FragmentManager fragmentManager) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.fragment.app.FragmentManager getFragmentManager() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.SharedPreferences getPref() {
            return null;
        }
        
        public MovieViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView, @org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull()
        android.content.SharedPreferences pref) {
            super(null);
        }
    }
}