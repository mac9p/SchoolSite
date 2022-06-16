import { Component, OnInit } from '@angular/core';
import {Attention} from "../../common/attention";
import {AttentionService} from "../../services/attention.service";

@Component({
  selector: 'app-attention-list',
  templateUrl: './attention-list.component.html',
  styleUrls: ['./attention-list.component.css']
})
export class AttentionListComponent implements OnInit {
  attentions!: Attention[];

  constructor(private attentionService: AttentionService) { }

  ngOnInit(): void {
    this.getAllAttentions();
  }

  getAllAttentions() {
    this.attentionService.getAllAttentions().subscribe(data => this.attentions = data);
  }
}
