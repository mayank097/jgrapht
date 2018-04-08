/*
 * (C) Copyright 2017-2018, by Joris Kinable and Contributors.
 *
 * JGraphT : a free Java graph-theory library
 *
 * This program and the accompanying materials are dual-licensed under
 * either
 *
 * (a) the terms of the GNU Lesser General Public License version 2.1
 * as published by the Free Software Foundation, or (at your option) any
 * later version.
 *
 * or (per the licensee's choosing)
 *
 * (b) the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation.
 */
package org.jgrapht.generate;

import java.util.*;

import org.jgrapht.*;

public class StackedBookGraphGenerator<V, E>
    implements GraphGenerator<V, E, V>
{
    public static final String CENTER_VERTEX[] = "Center Vertex";
    private int m;
    private int n;
    
    public static final String (int m,int n)
    {
          this.m=m;
          this.n=n;
     }
     
     /**
     * {@inheritDoc}
     */
    @Override
    public void generateGraph(
        Graph<V, E> target, VertexFactory<V> vertexFactory, Map<String, V> resultMap)
  {
     if (m < 1)||(n,2) {
            return;
        }
        for (int i;i<=n;i++)
         V centerVertex[] = vertexFactory.createVertex();
          target.addVertex(centerVertex[i]);
           if (resultMap != null) {
            resultMap.put(CENTER_VERTEX[], centerVertex);
        }
        for(int i;i<=n;i++)
        {
        for(int j;j<=m;j++)
        {
        V newVertex[j][i] = vertexFactory.createVertex();
          target.addVertex(newVertex[j][i]);
          target.addEdge(newVertex[j][i],centerVertex[i]);
          }
          }
          for (int i;i<=n;i++)
           {
        for(int j;j<=m;j++)
        {
        target.addEdge(newVertex[j][i],newVertex[j][i+1]);
         target.addEdge(centerVertex[i],newVertex[j][i+1]);
         }
         }
          
