/*
 * This file is part of WebLookAndFeel library.
 *
 * WebLookAndFeel library is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * WebLookAndFeel library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with WebLookAndFeel library.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.alee.managers.icon;

/**
 * Class referencing all icons used within WebLaF library UI elements.
 * These icons are only loaded into memory on demand so it is safe to reference them.
 *
 * @author Mikle Garin
 */

public final class Icons
{
    /**
     * General purpose icons.
     */
    public static final LazyIcon underline = new LazyIcon ( "underline" );
    public static final LazyIcon underlineHover = new LazyIcon ( "underline-hover" );
    public static final LazyIcon target = new LazyIcon ( "target" );
    public static final LazyIcon targetHover = new LazyIcon ( "target-hover" );
    public static final LazyIcon targetSelected = new LazyIcon ( "target-selected" );
    public static final LazyIcon pin = new LazyIcon ( "pin" );
    public static final LazyIcon pinHover = new LazyIcon ( "pin-hover" );
    public static final LazyIcon external = new LazyIcon ( "external" );
    public static final LazyIcon externalHover = new LazyIcon ( "external-hover" );
    public static final LazyIcon maximize = new LazyIcon ( "maximize" );
    public static final LazyIcon maximizeHover = new LazyIcon ( "maximize-hover" );
    public static final LazyIcon shrink = new LazyIcon ( "shrink" );
    public static final LazyIcon shrinkHover = new LazyIcon ( "shrink-hover" );
    public static final LazyIcon cross = new LazyIcon ( "cross" );
    public static final LazyIcon crossHover = new LazyIcon ( "cross-hover" );
    public static final LazyIcon crossSmall = new LazyIcon ( "cross-small" );
    public static final LazyIcon crossSmallHover = new LazyIcon ( "cross-small-hover" );
    public static final LazyIcon magnifier = new LazyIcon ( "magnifier" );
    public static final LazyIcon magnifierHover = new LazyIcon ( "magnifier-hover" );
    public static final LazyIcon globe = new LazyIcon ( "globe" );
    public static final LazyIcon globeHover = new LazyIcon ( "globe-hover" );
    public static final LazyIcon email = new LazyIcon ( "email" );
    public static final LazyIcon emailHover = new LazyIcon ( "email-hover" );

    /**
     * Medium arrow icons.
     */
    public static final LazyIcon up = new LazyIcon ( "up" );
    public static final LazyIcon down = new LazyIcon ( "down" );
    public static final LazyIcon left = new LazyIcon ( "left" );
    public static final LazyIcon right = new LazyIcon ( "right" );

    /**
     * Small arrow icons.
     */
    public static final LazyIcon upSmall = new LazyIcon ( "up-small" );
    public static final LazyIcon downSmall = new LazyIcon ( "down-small" );
    public static final LazyIcon leftSmall = new LazyIcon ( "left-small" );
    public static final LazyIcon rightSmall = new LazyIcon ( "right-small" );

    /**
     * Large arrow icons.
     */
    public static final LazyIcon upBig = new LazyIcon ( "up-big" );
    public static final LazyIcon downBig = new LazyIcon ( "down-big" );
    public static final LazyIcon leftBig = new LazyIcon ( "left-big" );
    public static final LazyIcon rightBig = new LazyIcon ( "right-big" );

    /**
     * Tree icons.
     */
    public static final LazyIcon squarePlus = new LazyIcon ( "square-plus" );
    public static final LazyIcon squarePlusDisabled = new LazyIcon ( "square-plus-disabled" );
    public static final LazyIcon squareMinus = new LazyIcon ( "square-minus" );
    public static final LazyIcon squareMinusDisabled = new LazyIcon ( "square-minus-disabled" );
}