/*
 * JBoss, Home of Professional Open Source
 * Copyright 2006, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. 
 * See the copyright.txt in the distribution for a full listing 
 * of individual contributors.
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU Lesser General Public License, v. 2.1.
 * This program is distributed in the hope that it will be useful, but WITHOUT A
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
 * PARTICULAR PURPOSE.  See the GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU Lesser General Public License,
 * v.2.1 along with this distribution; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA  02110-1301, USA.
 * 
 * (C) 2005-2006,
 * @author JBoss Inc.
 */
/*
 * Copyright (C) 1998, 1999, 2000,
 *
 * Arjuna Solutions Limited,
 * Newcastle upon Tyne,
 * Tyne and Wear,
 * UK.  
 *
 * $Id: PreInitLoader.java 2342 2006-03-30 13:06:17Z  $
 */

package com.arjuna.orbportability.internal.utils;


/*
 * This class allows the programmer (and us!) to register classes
 * which must be instantiated prior to ORB initialisation.
 */

public class PreInitLoader extends InitLoader
{

public PreInitLoader (String name, Object obj)
    {
        super("PreInitLoader", name, obj);

        initialise();
    }

public static String generateOAPropertyName(String objNameSpace)
    {
        return( objNameSpace + ".oa." + PropertyNamePrefix );
    }

public static String generateOAPropertyName(String objNameSpace, String orbName)
    {
        return( objNameSpace + "." + orbName + ".oa." + PropertyNamePrefix );
    }

public static String generateOAPropertyName(String objNameSpace, String orbName, String oaName)
    {
        return( objNameSpace + "." + orbName + ".oa." + oaName + "." + PropertyNamePrefix );
    }

public static String generateOAPropertyName(String objNameSpace, String orbName, String oaName, String initName)
    {
        return( objNameSpace + "." + orbName + ".oa." + oaName + "." + PropertyNamePrefix + "." + initName);
    }

public static String generateORBPropertyName(String objNameSpace, String orbName, String initName)
    {
        return( objNameSpace + "." + orbName + "." + PropertyNamePrefix + "." + initName);
    }

public static String generateORBPropertyName(String objNameSpace, String orbName)
    {
        return( objNameSpace + "." + orbName + "." + PropertyNamePrefix );
    }

public static String generateORBPropertyName(String objNameSpace)
    {
        return( objNameSpace + "." + PropertyNamePrefix );
    }

public static boolean isPreInitProperty(String propertyName)
    {
        return(propertyName.lastIndexOf(PropertyNamePrefix) == (propertyName.length() - PropertyNamePrefix.length()) );
    }

private static final String PropertyNamePrefix = "PreInit";}
