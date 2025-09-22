import { WebPlugin } from '@capacitor/core';

import type { PictureInPicturePlugin } from './definitions';

export class PictureInPictureWeb extends WebPlugin implements PictureInPicturePlugin {
  async echo(options: { value: string }): Promise<{ value: string }> {
    console.log('ECHO', options);
    return options;
  }
}
